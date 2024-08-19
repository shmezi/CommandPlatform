package lol.ezra.cf.model

/**
 * Represents the model of a command inside the command framework
 */
data class CommandModel<U>(

   val id: String,

   /**
    * The arguments that the command takes
    */
   val arguments: List<Argument<*>>,
   /**
    * Sub commands of the command
    */
   val children: List<CommandModel<U>>,

   /**
    * Execute the command on a sender
    */
   val execute: (user: U, args: List<Any>) -> Unit
)