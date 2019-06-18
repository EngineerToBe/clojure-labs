(ns cfb.vector)

(comment
  ;;Vectors in Clojure are similar to arrays in other languages.
  )

;; A Clojure empty Vector
[ ]

;; A Clojure Vector consist of some items

[1 2 3 4 5 6 7]

;; To create vector we can use vector function

(vector "abhishek" "anand" "amralkar" "2" "9" "1984" "pune")

;; Vectors in Clojure are heterogeneous. This means Vectors in Clojure can hold items of any type.

(def my-vector [1 "a" :b])

;; How to retrieve the items from the Clojure Vector?

(get [1 2 3 4 5 6 7 8] 0) ;; where 0 is index

or
(nth [1 2 3 4 5 6 7] 3) ;; where 3 is index and index starts from 0 in Clojure.

;; How to add items in Clojure Vectors?

(conj ["abhishek" "anand" "amralkar"] "anay")
;; ["abhishek" "anand" "amralkar" "anay"]


;; When you add item in Clojure Vector it will always get added to the end of the Vector.

;; Converting other Data Structure into Vector

(vec '(1 2 3 4 5 6 7))
