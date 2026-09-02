#!/bin/bash
cd "$HOME/daily-grind" || exit
echo "Watching for changes... (Ctrl+C to stop)"
while true
do
  if [[ $(git status --porcelain) ]]; then
    CHANGED=$(git status --porcelain | awk '{print $2}' | tr '\n' ', ' | sed 's/,$//')
    git add .
    git commit -m "Solved: $CHANGED"
    git push origin main
    echo "Pushed: $CHANGED at $(date '+%H:%M:%S')"
  fi
  sleep 10
done
