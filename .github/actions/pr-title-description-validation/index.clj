#!/usr/bin/env bb

(require '[clojure.java.shell :refer [sh]]
         '[clojure.string :refer [trim]])

(println (first *command-line-args*))

(sh "echo" "$GITHUB_EVENT_PATH")