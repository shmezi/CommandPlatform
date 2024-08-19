package lol.ezra.cf.examples

import lol.ezra.cf.CommandParser

fun main() {
   val parser = CommandParser<User>()
   parser.register(TestCommand::class.java)

}