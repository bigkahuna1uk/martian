(defproject martian-clj-http "0.1.1-SNAPSHOT"
  :description "clj-http implementation for martian"
  :url "https://github.com/oliyh/martian"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :plugins [[lein-modules "0.3.11"]]
  :dependencies [[martian :version]
                 [clj-http "2.2.0"]
                 [cheshire "5.6.2"]]
  :profiles {:provided {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :dev {:source-paths ["../test-common"]
                   :exclusions [[org.clojure/tools.reader]]
                   :dependencies [[org.clojure/clojure "1.8.0"]
                                  [org.clojure/tools.reader "0.10.0"]
                                  [pedestal-api "0.3.0-SNAPSHOT"]
                                  [io.pedestal/pedestal.service "0.5.0"]
                                  [io.pedestal/pedestal.jetty "0.5.0"]]}})
