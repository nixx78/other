1. Клонирование репозитория/получения изменений

Клонирование репозитория
	git clone https://github.com/nixx78/other.git - получение HEAD (обычно мастер)
	git clone --branch new_feature_0 https://github.com/nixx78/other.git (можно указать существующий branch и взять именно его)

Получения изменений из репозитория
	git pull
	В случае только что созданой ветки, нужно указать бранч на сервере, с котороым будет происходить слияние (merge)
	например: git pull origin master

2. Отправка изменения на сервер: add/commit/push
	
	Добавление файла в stage: git add <FILE_NAME>
	Можно, при commit задать ключ -a что приведет, к отправке всех измененных файлов в репозиторий
	
	Отправка изменения в локальный репозиторий (commit) 
	git commit -m "Commit message"
	
	Отправка изменения на сервер: git push
	Для нового бранча (один раз) нужно указать upstream на сервере, куда нужно складывать репозиторий
	git push --set-upstream origin new_feature_xyz
	
	Изменение merge message (vim):
	i -> ESC -> :wq

3. Работка с ветками (branches)
	Получение списка веток: git branch
	Переключения на существующую ветку: git checkout <NAME>
	Создание новой ветки: git checkout -b <NEW_BRANCH_NAME>
	Удаление ветки локально: git branch -d new_feature_0
	Удаление ветки удаленно: git push origin :new_feature_0 (после локального удаления)

4. Stash
	Отложить изменения в сторону: git stash save
	Список отложенных изменений: git stash list
	Получить изменения обратно: git stash pop/apply (apply не удаляет изменения из стека)

5. Слияние изменений merge/rebase
	
	Rebase: получение + слияние изменений с сервера:
	git pull
	git rebase origin/master
	
	Merge:
	git pull
	git merge origin/master
	Отмена merge: git merge --abort

6. Работа с метками (tags)
	Получения спика меток: git tag
	Кода в состояние метки: git checkout tags/<TAG_NAME> - будет состояние "Detached HEAD"
	
