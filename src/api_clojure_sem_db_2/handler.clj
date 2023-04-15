(ns api-clojure-sem-db-2.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.util.response :refer [response]]
            [ring.middleware.json :as middleware]))

(defroutes app-routes
  (GET "/" [] "Aqui chega o HTML, JS e CSS")
  (GET "/teste_json" [] (response {:msg "hello-world"}))
  (route/not-found "Not Found"))

(def app
  (middleware/wrap-json-response app-routes))
