package lol.ezra.cf

class NoMarker(clazz: String) : Throwable("No command marker found on class $clazz") {
}