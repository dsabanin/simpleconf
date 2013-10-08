(ns simpleconf.core
  (:require [clj-yaml.core :as yaml]
            [clojure.edn :as edn]))

(defn read-yaml
  [filename]
  (-> filename slurp yaml/parse-string))

(defn read-clojure
  [filename]
  (-> filename slurp edn/read-string))
