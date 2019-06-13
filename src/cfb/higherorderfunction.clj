(ns cfb.higherorderfunction.clj)

;; an example of map how map literal looks like

(map f [x y z])

(map f [a b c] [x y z])

;; in this function it takes 2 parameters 1 a function and a collection
(defn my-first-map [f c]
  (map f c))

(my-first-map inc [1 2 3])

(defn my-second-map [f c1 c2]
  (map f c1 c2))
