% Standardní vzhled kvalifikační práce
%
% Západočeská univerzita v Plzni
% Fakulta aplikovaných věd
% Katedra informatiky a výpočetní techniky
%
% Petr Lobaz, lobaz@kiv.zcu.cz, 2016/03/14
%
\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{thesiskiv}[2016/03/14 Thesis at DCSE (KIV)]
\DeclareOption{czech}{\def\KIV@lng{czech}}
\ExecuteOptions{czech}
\ProcessOptions\relax
%
% DEFAULT PAGE LAYOUT, etc.
%
\LoadClass[12pt,oneside]{report}
\RequirePackage{lmodern}
\RequirePackage[czech,british]{babel}
% select default language at the beginning of the document
% (other selection schemes, such as calling babel with [czech,british]
% or [british,czech], did not work properly)
\expandafter\AtBeginDocument%
 \expandafter{%
 \expandafter\selectlanguage%
 \expandafter{\KIV@lng}}
\RequirePackage[utf8]{inputenc}
\RequirePackage[T1]{fontenc}
\RequirePackage[a4paper,left=37mm,right=37mm,top=33mm,bottom=40mm]{geometry}
\linespread{1.1}
%
% USER COMMANDS
%
% Czech double quotes: use \uv{quoted text}
\ifx\uv\undefined
 \newcommand{\uv}[1]{\quotedblbase{#1}\textquotedblleft}
\fi 
%
\newcommand{\university}[1]{\def\@university{#1}}
\newcommand{\faculty}[1]{\def\@faculty{#1}}
\newcommand{\department}[1]{\def\@department{#1}}
\newcommand{\subject}[1]{\def\@subject{#1}}
\newcommand{\titlepageyear}[1]{\def\KIV@titlepageyear{#1}}
\newcommand{\titlepagetown}[1]{\def\KIV@titlepagetown{#1}}
%
% in Czech, Declaration text differs if the writer is male or female
%
%
% CHAPTER LOOK
%
\def\@makechapterhead#1{%
  {\parindent \z@ \raggedright \normalfont
    \Huge\bfseries
    \ifnum \c@secnumdepth >\m@ne
    	\hangindent=1.5em
        \noindent\hbox to 1.5em{\thechapter\hfil}%
    \fi%
    #1\par\nobreak
    \vskip 40\p@
  }}
\def\@makeschapterhead#1{%
  {\parindent \z@ \raggedright \normalfont
    \interlinepenalty\@M
    \Huge \bfseries  #1\par\nobreak
    \vskip 40\p@
  }}
%
% OPENING PAGES
%
% top offset of the Declaration and the Abstract(s) 
\def\KIV@chapstarrule{\vrule width0pt height 120pt}
%
\renewcommand\maketitle{
  {% first page is a bit bigger
  \enlargethispage{25mm}
  \addtolength{\topmargin}{-8mm}
  \pagestyle{empty}
  \thispagestyle{empty}
  \begin{titlepage}%
  \begin{center}%
	{\fontsize{22}{28}\selectfont
	 \@university\par
	 \@faculty\par
	 \hbox to \textwidth{\hss\@department\hss}}\vskip 26mm
	{\fontsize{28}{35}\selectfont\bf
	 \@subject\par\vskip 17mm
 	 \@title\par}\vfill
    {\fontsize{14}{14}\selectfont\ 
	 \hfill Martin Kantořík \hskip 1mm kantorik@students.zcu.cz \newline}
    {\fontsize{14}{14}\selectfont\ \KIV@titlepageyear
	 \hfill Michal Tušl \hskip 17mm tuslm@students.zcu.cz }
  \end{center}
  \end{titlepage}%
  }
  \newpage
  \thispagestyle{empty}  
}
%
% LANGUAGE DEPENDENT DEFAULT SETTINGS
%
\@ifclasswith{thesiskiv}{czech}{
 \university{Západočeská univerzita v Plzni}
 \faculty{Fakulta aplikovaných věd}
 \department{Katedra informatiky a výpočetní techniky}
 \subject{Semestrální práci}
 \titlepagetown{Plzeň}
 
}{}
\@ifclasswith{thesiskiv}{english}{
 \university{University of West Bohemia}
 \faculty{Faculty of Applied Sciences}
 \department{Department of Computer Science and Engineering}
  \subject{Term work}
 \titlepagetown{Plzeň}
}{}
%
% OTHER DEFAULT SETTINGS
%
\titlepageyear{\today}
%
% END OF CLASS DEFINITION
%