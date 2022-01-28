# spring-cloud-example

## Subindo o banco do fornecedor local com docker-compose
Execute o comando abaixo na raiz do projeto supplier

```docker-compose up -d```

## Subindo o banco do fornecedor local com docker
Execute o comando abaixo na raiz do projeto supplier

```docker build -t supplier_db . && docker run -d --name supplier_db -p 5433:5432 supplier_db:latest```

obs: caso ja tenha feito o build da imagem nas proximas vezes utilizar somente o run
