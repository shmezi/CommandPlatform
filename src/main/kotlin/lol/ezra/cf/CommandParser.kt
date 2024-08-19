package lol.ezra.cf

import lol.ezra.cf.codec.Codec
import lol.ezra.cf.model.Argument
import lol.ezra.cf.model.CommandModel

class CommandParser<U> {

   private val commandMap = mutableMapOf<String, CommandModel<U>>()

   private val codec = Codec()

   private fun registerModel(command: CommandModel<U>) {
      commandMap[command.id] = command
   }


   private fun executeAs(user: U, command: String, arguments: List<Any>) {
      commandMap[command]?.execute?.invoke(user, arguments)
   }


   fun register(command: Class<*>) {
      if (!command.isAnnotationPresent(Command::class.java)) throw NoMarker(command.name)
      val id = command.getAnnotation(Command::class.java).id

      val annotated = command.declaredMethods.filter { it.isAnnotationPresent(Command::class.java) }
      val funcs = annotated.map { Pair(it, it.getAnnotation(Command::class.java)) }

      val default = funcs.first { it.second.id == "" }.first

      for (param in default.parameters) {
         val serializer = codec.serializer(param.type)
         val t = param.type
         val argument = Argument(,serializer)
      }
   }


}