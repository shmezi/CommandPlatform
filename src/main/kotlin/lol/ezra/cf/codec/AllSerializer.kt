package lol.ezra.cf.codec

import lol.ezra.cf.NoSerializerFound

interface AllSerializer<T> {
   val type: Class<T>
   val serializers: MutableMap<Class<*>, Serializer<T>>
   fun <V : Any> deserialize(type: Class<V>, value: V): T =
      serializers[type]?.deserialize(value) ?: throw NoSerializerFound("${this.type}:$type")

}