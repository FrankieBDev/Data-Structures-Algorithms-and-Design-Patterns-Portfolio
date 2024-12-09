class TrieNode {
    constructor() {
        this.children = new Map();
        this.isEndOfAreaCode = false;
        this.location = null;
    }
}

class PhoneTrie {
    constructor() {
        this.root = new TrieNode();
    }

    areaCode(areaCode, location) {
        let node = this.root;
        for (const char of areaCode) {
            if (!node.children.has(char)) {
                node.children.set(char, new TrieNode());
            }
            node = node.children.get(char);
        }
        node.isEndOfAreaCode = true;
        node.location = location;
    }

    isValid(phoneNumber) {
        let node = this.root;
        let detectedLocation = null;

        for (const char of phoneNumber) {
            if (isNaN(parseInt(char))) {
                break;
            }

            if (!node.children.has(char)) {
                return detectedLocation;
            }

            node = node.children.get(char);
            if (node.isEndOfAreaCode) {
                detectedLocation = node.location;
            }
        }

        return detectedLocation;
    }
}


    const phoneTrie = new PhoneTrie();

    phoneTrie.areaCode("0114", "Sheffield");
    phoneTrie.areaCode("0118", "Reading");
    phoneTrie.areaCode("0161", "Manchester");
    phoneTrie.areaCode("01252", "Aldershot");

    console.log(phoneTrie.isValid("011412345678"));
    console.log(phoneTrie.isValid("01189328532"));
    console.log(phoneTrie.isValid("01614567890"));
    console.log(phoneTrie.isValid("01252545197"));
    console.log(phoneTrie.isValid("012369567899"));
    console.log(phoneTrie.isValid("fhjv369567899"));



