(ns build)

(defn -main [& args]
  (spit "dist/index.html" "<h1>Hello!</h1>"))
