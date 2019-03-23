(ns cfb.datastruct.list.clj)

;;Lists in Clojure and some operations that can be performed on List

;; A Clojure empty List
()

;; A Clojure List consist of some items

(1 2 3 4 5 6 7)

;; To create List we can use list function

(list "abhishek" "anand" "amralkar" "2" "9" "1984" "pune")

;; How to retrieve from the list?

(nth '(1 2 3 4 5 6 7) 4)

;; Noticed that little quote before the list? This is the way to tell compiler that this list is not function call.

;; How to add items in Clojure list?

(cons '("abhishek" "anand" "amralkar") "anay")

;; We can use conj too with list but they are by design meant for vectors.
;; conj will add element at the beginning of the list.

(conj '(:abhishek :anand) :amralkar)
;;(:amralkar :abhishek :anand)

;; We can use first, last and rest on the list too

(first '( 1 2 3 4 5 6 7 8))
(last '( 1 2 3 4 5 6 7 8))
(rest '( 1 2 3 4 5 6 7 8))
