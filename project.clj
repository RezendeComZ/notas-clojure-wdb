(defproject notas-clojure-wdb "0.1.0-SNAPSHOT"
  :description "A Clojure Notes app without database"
  :url "https://github.com/RezendeComZ/notas-clojure-wdb"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-defaults "0.3.2"]
                 [ring/ring-json "0.5.1"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler notas-clojure-wdb.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}})
