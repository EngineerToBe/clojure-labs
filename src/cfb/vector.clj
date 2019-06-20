(ns cfb.vector)

;; Vectors in Clojure are one of the most used data structures.

(comment
  ;;Vectors in Clojure are similar to arrays in other languages.
  )

;; A Clojure empty Vector
[ ]

;; A Clojure Vector consist of some items

[1 2 3 4 5 6 7]

;; To create vector we can use vector function also

(vector "abhishek" "anand" "amralkar" "2" "9" "1984" "pune")

;; is equivalent to

["abhishek" "anand" "amralkar" "2" "9" "1984" "pune"]

;; Vectors in Clojure are heterogeneous. This means Vectors in Clojure can hold items of any type.

(def my-vector [1 "a" :b "anay" "brahma" "india"])

;; Vectors can be nested

[1 [ true 3 "abhi" "anay"] 10]

;; We can perform various tasks on Vectors we create like
;; Count the number of items in the vector

(count my-vector)

;; get the first items from the vector
;; gives only first item from the vector

(first my-vector)

;; give rest of the items from the vector
;; this will not give first item in vector
;; the output of the rest on the vector is not vector
;; rather it is a collection named as sequence.

(rest my-vector)

;; We can get any items for the vector using get also

(get my-vector 0) ;; where 0 is index

;; or we can use the nth to get the items from the vector

(nth my-vector 3) ;; where 3 is index and index starts from 0 in Clojure.

;; How to add items in Clojure Vectors?
;; when you evaluate it you will notice the append always happened
;; at the end of the vector.

(conj my-vector "facebook")

;; to add the item in front of the vector we can use cons

(cons "twitter" my-vector)

;; very important point about Clojure data structure, any modification in data structure will always create a new data structure. Data Structure in Clojure are immutable.
