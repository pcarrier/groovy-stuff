import groovy.transform.CompileStatic

@CompileStatic
class Bottles {
    static void main(String... args) {
      for (n in 1..100)
        println "${n} bottles"
    }
}