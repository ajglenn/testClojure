;; This is a test project during the kcdc14 conference.

(require '[clojure.java.io :as io])

(with-open [rdr (io/reader "test.txt")]
  (doseq [line (line-seq rdr)]
    (println line)))

(defn write-thousand-lines [filename]
  (with-open [wrt (io/writer filename)]
    (doseq [x (range 1 1000)]
      (.write wrt (str x "\n")))))

(write-thousand-lines "written.txt")