package lol.ezra.cf.codec

import lol.ezra.cf.NoSerializerFound

class Codec {
   private val serializers = mutableMapOf<Class<*>, AllSerializer<*>>()
   fun canSerialize(type: Class<*>) = serializers.containsKey(type)
   fun <T>serializer(type: Class<T>) = serializers[type] as AllSerializer<T>? ?: throw NoSerializerFound(type.name)
}