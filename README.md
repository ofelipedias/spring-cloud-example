# spring-cloud-example

## Subindo o banco do fornecedor local com docker-compose
Execute o comando abaixo na raiz do projeto supplier

``docker-compose up -d``

## Subindo o banco do fornecedor local com docker
Execute o comando abaixo na raiz do projeto supplier

``docker build -t supplier_db . && docker run -d --name supplier_db -p 5433:5432 supplier_db:latest``

obs: esse comando só é utilizado na primeira vez pra criar o banco, nas proximas pode utilizar o comando:

``docker start supplier_db `` ou ``docker stop supplier_db`` para desligar o banco
