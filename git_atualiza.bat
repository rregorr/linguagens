@echo off
call git add .
call git commit -m "fazendo alterações"
call git push origin main
echo Foram executados os seguintes comandos: git add ., git commit -m "fazendo alterações" e git push origin main
