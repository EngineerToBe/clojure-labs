(ns cfb.cb.core)

;; This is how you do comment in Clojure.
;; s-expression with prefix notation
;; (operation/function arguments)

;; to check the version of the Clojure on your system
(clojure-version)

;; doc function to check the documentation for the Clojure functions
(doc map)
(doc +)
(doc println)

;; print whatever you want to print
(println \a) ;;character
(println "TWO in String") ;;string
(println 2) ;; long
(println 2.5555557) ;; double
(println 22/7) ;;fraction
(println true) ;;boolean
(println *ns*)
(println 0x64)  ;; byte

(println :a)
(println (keyword "a"))
(println (keyword "a" "b"))
(println (keyword 123)) ;; nil

;; find the type for the given value
(type \b)
(type "Om Namah Shivay")

(type 1)
(type (short 1))
(type 2233.445)

(type 1000000000000000000000000)
(type 10000000000000000.12345600000000)
(type 1000000000000000000000000000000000.12345600000000)

(type map)
(type print)

(type true)
(type false)

(type 'iAmSymbol)
(type :a)
