(ns cfb.concepts)

;; The intent of this document is to explain
;; the core/basic concepts of the Clojure.
;; Which will help us to make the foundation
;; for starting writing Clojure code.


;; Form in Clojure means the valid code.
;; Expressions are nothing but Clojure forms.

( + 1 2 3 4)

;; Above we wrote a valid form.

;; Control Flow in Clojure

;; Three basic Control Flow in Clojure are

;; 1. if
;; 2. do
;; 3. when

;; This is how a if control flow looks like

(if (= :a :b)
  (println "Yes a is equal to b")
  (println "No a is not equal to b"))

(if (= :a :a)
  (println "Yes a is equal to a")
  (println "No a and b are different"))

;; In Clojure we cannot have multiple branches in if and else block.
;; But there is alternative for it which is do

(if (= name "anay")
  (do
    (println "Anay's father name is Abhishek")
    (println "Anay's mother name is Avni"))
  (do (println "No his name is not Anay")))

;; when operator is if and do withour else branch

(when (= name "anay")
  (println "Yes his super dude"))



;; In Clojure nil and false are falsy rest everything is truthy.
;; to check the nil value we can use

(nil? nil)

;; to check the equality in Clojure use =

(= 2 2)

(= 2 3)

;; Clojure also uses boolean operators like "and" "or"

;; and always return the first falsey value else the last truthy value.
(and "Hello!" "World")

;; or always return the first truthy value else the last value.
(or "Hello" "World")



;; to bind a name to value in Clojure we use "def"

(def name ["abhishek"])
