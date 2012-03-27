(defproject ib-re-actor "0.0.1"
  :description "Clojure friendly wrapper for InteractiveBrokers java API"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [clj-time "0.3.0"]
                 ;; download this from IB and add it to your local m2
                 ;; repo, as per leiningen's instructions
                 [jtsclient "9.6.7"]]
  :dev-dependencies [[midje "1.3-alpha4"]
                     [lein-exec "0.1"]
                     [lein-marginalia "0.6.1"]])
