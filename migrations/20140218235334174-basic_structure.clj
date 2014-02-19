;; migrations/20140218235334174-basic_structure.clj

(def tables
  ["courses" "topics" "lessons"])

(defn up []
  (let [s "CREATE TABLE " % "(id serial, name text UNIQUE, description text)"]
    (map #(str %) tables)))

(defn down []
  (map #(str "DROP TABLE " %) tables))
