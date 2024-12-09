class TrieNode {
    val children = mutableMapOf<Char, TrieNode>()
    var isEndOfAreaCode = false
    var location: String? = null
}

class PhoneTrie {
    private val root = TrieNode()
    fun areaCode(areaCode: String, location: String) {
        var node = root
        for (char in areaCode) {
            node = node.children.getOrPut(char) { TrieNode() }
        }
        node.isEndOfAreaCode = true
        node.location = location
    }

    fun isValid(phoneNumber: String): String? {
        var node = root
        var detectedLocation: String? = null
        for (char in phoneNumber) {
            if (!char.isDigit()) {
                break
            }
            node = node.children[char] ?: return detectedLocation
            if (node.isEndOfAreaCode) {
                detectedLocation = node.location
            }
        }
        return detectedLocation
    }
}

fun main() {
    val phoneTrie = PhoneTrie()

    phoneTrie.areaCode("0114", "Sheffield")
    phoneTrie.areaCode("0118", "Reading")
    phoneTrie.areaCode("0161", "Manchester")
    phoneTrie.areaCode("01252", "Aldershot")

    println(phoneTrie.isValid("011412345678"))
    println(phoneTrie.isValid("01189328332"))
    println(phoneTrie.isValid("01614567890"))
    println(phoneTrie.isValid("01252545197"))
    println(phoneTrie.isValid("01234567899"))
}