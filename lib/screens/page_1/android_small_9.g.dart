// *********************************************************************************
// PARABEAC-GENERATED CODE. DO NOT MODIFY.
//
// FOR MORE INFORMATION ON HOW TO USE PARABEAC, PLEASE VISIT docs.parabeac.com
// *********************************************************************************

import 'package:flutter/material.dart';
import 'package:auto_size_text/auto_size_text.dart';

class AndroidSmall9 extends StatefulWidget {
  const AndroidSmall9({
    Key? key,
  }) : super(key: key);
  @override
  _AndroidSmall9 createState() => _AndroidSmall9();
}

class _AndroidSmall9 extends State<AndroidSmall9> {
  _AndroidSmall9();

  @override
  Widget build(BuildContext context) {
    return Material(
      child: Stack(children: [
        Positioned(
          left: 150.0,
          width: 60.0,
          top: 112.0,
          height: 60.0,
          child: Image.asset(
            'assets/images/icons8moonsymbol601.png',
            package: 'dawn_note',
            width: 60.000,
            height: 60.000,
            fit: BoxFit.none,
          ),
        ),
        Positioned(
          left: 21.0,
          width: 319.0,
          top: 206.0,
          height: 92.0,
          child: Container(
              width: 319.000,
              height: 92.000,
              child: AutoSizeText(
                'Dawn Note',
                style: TextStyle(
                  fontFamily: 'Javanese Text',
                  fontSize: 40,
                  fontWeight: FontWeight.w400,
                  letterSpacing: 0,
                  color: Colors.white,
                ),
                textAlign: TextAlign.center,
              )),
        ),
        Positioned(
          left: 21.0,
          width: 319.0,
          top: 604.0,
          height: 15.0,
          child: Container(
              width: 319.000,
              height: 15.000,
              child: AutoSizeText(
                'Copyright 2022.List.All rights reserved.',
                style: TextStyle(
                  fontFamily: 'Javanese Text',
                  fontSize: 10,
                  fontWeight: FontWeight.w400,
                  letterSpacing: 0,
                  color: Colors.white,
                ),
                textAlign: TextAlign.center,
              )),
        ),
      ]),
    );
  }

  @override
  void dispose() {
    super.dispose();
  }
}
