package lol.ezra.cf


/**
 * Define a command / a subcommand
 */
@Target(
   AnnotationTarget.FUNCTION,
   AnnotationTarget.CLASS
)
annotation class Command(val id: String = "")
