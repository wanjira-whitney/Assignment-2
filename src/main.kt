fun main(){
    greeting("Kimberly")
    add(345,89)
    add(23,637,59,36)
    add("adventurous")
}
fun greeting(name: String){
    println("Hello " +name)
}


fun add(a: Int, b: Int) {
    var modulus = a%b
    println(modulus)
}


fun add(a:Int, b:Int, c:Int, d:Int ){
    var sum = a+b+c+d
    println(sum)
}
fun add(statement: String){
    println("An interesting thing about me is that I am " + statement)
}

