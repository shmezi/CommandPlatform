package lol.ezra.cf.codec

interface Serializer<T> {

   fun serialize(value: T): Any
   fun deserialize(value: Any): T
}