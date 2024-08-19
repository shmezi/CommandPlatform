package lol.ezra.cf

class NoSerializerFound(clazz: String) : Throwable("No serializer was found for type: $clazz") {
}