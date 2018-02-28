# Rotate Array
curl -X POST \
  http://127.0.0.1:8080/restful/array_rotation \
  -H 'Cache-Control: no-cache' \
  -H 'Content-Type: application/json' \
  -d '{
  "arr":[1,2,3],
  "size":3,
  "rotateByNElements":2
}'

