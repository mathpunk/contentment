(ns build)

(defn -main [& args]
  (spit "resources/public/index.html" "<h1>Deployed!</h1>"))
