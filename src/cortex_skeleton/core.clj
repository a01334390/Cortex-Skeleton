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

(def collection (with-open [rdr (clojure.java.io/reader "SMSSpamCollection.txt")]
(reduce conj [] (line-seq rdr))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Si puedes leer esto, si funciono."))

(def params
  {:test-ds-size      50000 ;; total = 284807, test-ds ~= 17.5%
    :optimizer         (adam/adam)   ;; alternately, (adadelta/adadelta)
    :batch-size        100
    :epoch-count       30
    :epoch-size        200000})

; (def network-description
;   [(layers/input (count collection 1 1 :id :data) ;width, height, channels, args
;   (layers/linear->relu 20) ; num-output & args
;   (layers/dropout 0.85)
;   (layers/linear->relu 10)
;   (layers/linear 2)
;   (layers/softmax :id :label)])
    
    