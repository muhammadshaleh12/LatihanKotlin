fun main(){
   var aku = 10
   var predikat: Char
   when(aku){
       in 100 downTo 90 -> predikat = 'H'
       in 89 downTo 80 -> predikat = 'K'
       else -> predikat = 'F'
   }
   println(predikat)
}
