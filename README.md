# simpleconf

Very simple configuration file management.

Features:

* Supports YAML and Clojure EDN files.
* Reading Clojure files will not evaluate them.
* No config file structure imposed.

## Usage

```clojure
(ns example1
    (:require [simpleconf.core :as conf]))

(def global-conf (conf/read-yaml "config.yaml"))
(def another-conf (conf/read-clojure "config.yaml"))
```

## License

Copyright © 2013 Dima Sabanin

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
