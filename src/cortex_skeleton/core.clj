(ns cortex-skeleton.core
(:require [clojure.java.io :as io]
           [clojure.string :as string]
           [clojure.data.csv :as csv]
           [clojure.core.matrix :as mat]
           [clojure.core.matrix.stats :as matstats]
           [cortex.nn.layers :as layers]
           [cortex.nn.network :as network]
           [cortex.nn.execute :as execute]
           [cortex.optimize.adadelta :as adadelta]
           [cortex.optimize.adam :as adam]
           [cortex.metrics :as metrics]
           [cortex.util :as util]
           [cortex.experiment.util :as experiment-util]
           [cortex.experiment.train :as experiment-train])  
(:gen-class))

(println (with-open [rdr (clojure.java.io/reader "SMSSpamCollection.txt")]
(reduce conj [] (line-seq rdr))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Si puedes leer esto, si funciono."))
