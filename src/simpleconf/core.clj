(ns simpleconf.core
  (:require [clj-yaml.core :as yaml]))

(defn read-yaml
  [filename]
  (-> filename slurp yaml/parse-string))

(defn read-clojure
  [filename]
  (-> filename slurp read-string))
