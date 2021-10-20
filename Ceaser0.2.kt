fun Caesar(Key:Int,Text:String): Unit{
    var alphabet: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    //
    var key = Key
    var arr = mutableListOf<Int>()
    while(key!=0){
        var digit = key%10
        arr.add(digit)
        key=key/10
    }
   arr.reverse()
   //ключ кодировки
    var i = 0
    var lenth = arr.lastIndex + 1
    for(letter in Text){
        if(i == lenth) i = 0
        var register = false
        if(letter.isLowerCase()) register=true
        var position = alphabet.indexOf(letter.toUpperCase())
        if(letter == ' ')
            print(" ")
        else if(position<arr[i]) {
            position=alphabet.length-(arr[i]-position)
            if(register == true) print(alphabet[position].toLowerCase())
            else print(alphabet[position])
        }
        else {
            position -= arr[i]
            if(register == true) print(alphabet[position].toLowerCase())
            else print(alphabet[position])
            i++
        }
    }
}
fun main() {
    Caesar(4043,"Enxrwhe Jed")
}
