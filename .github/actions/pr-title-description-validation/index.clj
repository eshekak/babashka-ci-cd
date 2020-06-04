#!/usr/bin/env bb

(require '[clojure.java.shell :refer [sh]]
         '[clojure.string :refer [trim]]
         '[clojure.string :as str])

(def title-regex (re-pattern (first *command-line-args*)))
(def title (second *command-line-args*))
(def ref-name (second (next *command-line-args*)))

(defn valid-title? [] (re-matches title-regex title))

(defn title-starts-with-ref-name? [] (str/starts-with? title ref-name))

(valid-title?)
(title-starts-with-ref-name?)