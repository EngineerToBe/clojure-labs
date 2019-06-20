(ns cfb.functions)

;; Fucntions are the fundamental units of the Clojure code

;; Our first Clojure function
;; In below function no parameters is passed and the function returns the string "Hello Anay!"

(defn my-first-clj-function []
  (println "Hello Anay!"))

;; Writing function with parameter is also straight forward

(defn my-second-clj-function [what]
  (println "Tell me " what ""))
