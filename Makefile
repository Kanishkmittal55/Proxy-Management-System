.PHONY: start-db stop-db logs-db

up:
	docker-compose up -d

stop-db:
	docker-compose down

logs-db:
	docker-compose logs -f db
