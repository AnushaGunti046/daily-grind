#!/bin/bash
cd "$HOME/daily-grind" || exit
echo "Watching for changes... (Ctrl+C to stop)"
while true
do
  if [[ $(git status --porcelain) ]]; then
    git add .
    git commit -m "Auto-update: $(date '+%Y-%m-%d %H:%M:%S')"
    git push origin main
    echo "Pushed at $(date '+%H:%M:%S')"
  fi
  sleep 10
done

