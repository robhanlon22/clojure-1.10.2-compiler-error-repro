(defproject repro "0.1.0-SNAPSHOT"
  :description "Reproduces an opaque Clojure compiler error."
  :url "https://github.com/robhanlon22/repro"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.2"]
                 [riddley "0.2.0"]
                 [potemkin "0.4.5"]
                 [com.rpl/specter "1.1.3"]
                 [methodical "0.10.0-alpha"]]
  :repl-options {:init-ns repro.core})
