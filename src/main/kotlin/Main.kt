fun main(){
    val x=longestSubstringPalindrome("maubad")
    println(x)
    val str="read"
    println(str.reversed())
    val y=checkPalindrome("Hello")
    y.toString()
    val vowels=countNumberVowel("Name")
}
//Write a function to find the longest palindrome substring in a given string in Kotlin.
fun longestSubstringPalindrome(str:String): Int {
    val length=str.length
    return length
}
//Write a function to reverse a given string in Kotlin.
fun reverse(str: String){
    var reverse=reverse(str)
    return reverse
}
//Write a function to check if a given string is a palindrome or not in Kotlin.
fun checkPalindrome(str: String){
   if(str===str){
       println("String is a palindrome")

   }else{
       println("String is not in Kotlin")
   }

}
//Write a function to count the number of vowels in a given string in Kotlin.
fun countNumberVowel(vowels:String){
    val vowels=vowels.count()
    println(vowels)
}