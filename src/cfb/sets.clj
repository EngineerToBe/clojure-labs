(ns cfb.sets)
;; Clojure Sets

;; Empty sets

#{}

;; How non empty set looks like

#{:abhishek :anay :aadhya}

;; we can use get to retrieve from the sets

(get #{:abhishek :anay :aadhya} :abhishek)

;; we can also use keywords to retrieve from the sets if the elements are keywords.

(:abhishek #{:abhishek :anay :aadhya})

;; To add elemensts into sets we can use conj

(conj #{:abhishek} :anay)

;; To remove element for the sets we can use disj

(disj #{:abhishek :anay} :abhishek)

;; we can also query sets using functions like contains?

(contains? #{:abhishek :anay} :anay)

;; we can also use functions like union, difference and intersection

user=> (clojure.set/union #{:a :b :c} #{:c :d :e})
#{:e :c :b :d :a}

user=> (clojure.set/difference #{:a :b :c} #{:c :d :e})
#{:b :a}

user=> (clojure.set/intersection #{:a :b :c} #{:c :d :e})
#{:c}
