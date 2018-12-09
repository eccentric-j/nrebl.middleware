(defproject rickmoynihan/nrebl.middleware "0.1.0-SNAPSHOT"
  :description "An nREPL and cider middleware for capturing and
  browsing data in REBL."
  :url "https://github.com/Swirrl/matcha"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.10.0-RC4"]]

  :profiles {:dev {:lein-tools-deps/config {:aliases [:dev :rebl]}}
             :dev-old {:lein-tools-deps/config {:aliases [:dev-old-nrepl :rebl]}}}

  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]

  :plugins [[lein-tools-deps "0.4.1"]]
  :lein-tools-deps/config {:config-files [:install :user :project]}
  )
