(ns cfb.datastruct.maps)

;; Clojure Maps

;; Empty Maps

{}

;; How non empty maps in Clojure looks like

{:father "abhishek" :son "anay"}
;; ->   {:father "abhishek", :son "anay"}

;; commas in clojure maps are whitespace , can be ignored.

;; To get value out of the maps we can use get.

(get {:father "abhishek" :son "anay"} :son)

;; Just in case if the key not present we can also define the default value

(get {:father "abhishek" :son "anay"} :lastname "amralkar")

;; more idiomatic way to retrieve values from the maps is to use keywords as a functions.

(:father {:father "abhishek" :son "anay"})

;; we can use keys function to get all the keys from the maps

(keys {:father "abhishek" :son "anay"})

;; we can use vals function to get all the values from the maps

(vals {:father "abhishek" :son "anay"})

;; assoc is another function we can use to update the maps

(assoc {:father "abhishek" :son "anay"} :son "vinayak")

;; dissoc is the function to remove the key values from the maps

(dissoc {:father "abhishek" :son "anay"} :father)

;; merge is another useful function to merge the multiple maps

(merge {:father "abhishek"} {:son "anay"})
