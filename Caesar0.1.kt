fun Caesar(Key:Int,Text:String): Unit{
    var alphabet: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for(letter in Text){
        var register = false
        if(letter.isLowerCase()) register=true
        var position = alphabet.indexOf(letter.toUpperCase())
        if(letter == ' ')
            print(" ")
        else if(position<Key) {
            position=alphabet.length-(Key-position)
            if(register == true) print(alphabet[position].toLowerCase())
            else print(alphabet[position])
        }
        else {
            position -= Key
            if(register == true) print(alphabet[position].toLowerCase())
            else print(alphabet[position])
        }
    }
}
fun main() {
    Caesar(6,"O Rubk Quzrot")
}
