package lol.ezra.cf.model

import lol.ezra.cf.codec.AllSerializer

/**
 * Represents an argument that is used inside of a [CommandModel]
 * @param value The type for the argument
 * @param serializer The serializer that will be used to decode this argument.
 * @param default The default value of the argument if one is provided.
 * Arguments with default values are non required arguments.
 */
class Argument<T>(val value: Class<T>, val serializer: AllSerializer<T>, val default: T?)